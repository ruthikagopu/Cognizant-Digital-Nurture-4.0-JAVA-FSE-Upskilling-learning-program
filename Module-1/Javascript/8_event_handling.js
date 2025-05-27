document.querySelectorAll(".register-btn").forEach((btn) => {
  btn.onclick = () => alert("Registered!");
});

document.querySelector("#categoryFilter").onchange = function () {
  console.log("Filtered by: ", this.value);
};

document.querySelector("#search").onkeydown = function (e) {
  if (e.key === "Enter") console.log("Searching: ", this.value);
};
