fetch("events.json")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error("Failed to load events", err));

async function loadEvents() {
  const spinner = document.querySelector("#loading");
  spinner.style.display = "block";
  const res = await fetch("events.json");
  const data = await res.json();
  console.log(data);
  spinner.style.display = "none";
}