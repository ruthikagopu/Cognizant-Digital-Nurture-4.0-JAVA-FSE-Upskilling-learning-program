function debugSubmit() {
  console.log("Submitting form...");
  const data = { name: "John" };
  console.log("Payload:", data);
  fetch("https://mockapi.com/register", {
    method: "POST",
    body: JSON.stringify(data),
  });
}
