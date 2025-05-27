function submitRegistration(data) {
  fetch("https://mockapi.com/register", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(data),
  })
    .then(res => res.json())
    .then(() => alert("Registered successfully!"))
    .catch(() => alert("Failed to register"));

  setTimeout(() => console.log("Simulating delay..."), 2000);
}