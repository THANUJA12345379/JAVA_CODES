const form = document.getElementById('student-form');
const studentList = document.getElementById('student-list');

form.addEventListener('submit', async (e) => {
  e.preventDefault();

  const studentData = {
    name: document.getElementById('name').value,
    age: document.getElementById('age').value,
    course: document.getElementById('course').value,
    phone: document.getElementById('phone').value,
    address: document.getElementById('address').value,
    email: document.getElementById('email').value,
  };

  // Call Java backend via POST
  const response = await fetch('http://localhost:8080/addStudent', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(studentData)
  });

  if (response.ok) {
    alert("✅ Student added!");
    loadStudents(); // refresh the list
    form.reset();
  } else {
    alert("❌ Error adding student");
  }
});

// Fetch all students from Java backend
async function loadStudents() {
  const res = await fetch('http://localhost:8080/getStudents');
  const students = await res.json();

  studentList.innerHTML = '';
  students.forEach((s) => {
    const div = document.createElement('div');
    div.className = 'student-card';
    div.innerHTML = `
      <strong>${s.name}</strong> | Age: ${s.age} | Course: ${s.course} <br>
      Phone: ${s.phone} | Email: ${s.email} <br>
      Address: ${s.address}
    `;
    studentList.appendChild(div);
  });
}

loadStudents(); // Load on page start