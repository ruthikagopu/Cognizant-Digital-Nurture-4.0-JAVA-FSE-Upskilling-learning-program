document.querySelector("#regForm").onsubmit = function (e) {
  e.preventDefault();
  const name = this.elements["name"].value;
  const email = this.elements["email"].value;
  if (!name || !email) {
    alert("Please fill all fields");
  } else {
    console.log("Submitted", name, email);
  }
};