document.querySelector("#events").innerHTML = "";
eventList.forEach((e) => {
  const div = document.createElement("div");
  div.textContent = e.name;
  document.querySelector("#events").appendChild(div);
});