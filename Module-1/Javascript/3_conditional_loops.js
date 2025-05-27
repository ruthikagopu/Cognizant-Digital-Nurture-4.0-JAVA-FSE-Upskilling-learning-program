const events = [
  { name: "Cleanup", date: "2025-06-01", seats: 10 },
  { name: "Music Night", date: "2024-01-01", seats: 0 },
];

const today = new Date("2025-05-27");
events.forEach((event) => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(`Valid Event: ${event.name}`);
  }
});

function register(event) {
  try {
    if (event.seats > 0) {
      event.seats--;
    } else {
      throw new Error("No seats left");
    }
  } catch (err) {
    console.error(err.message);
  }
}