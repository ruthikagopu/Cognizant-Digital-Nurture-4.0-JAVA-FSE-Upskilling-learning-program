function showEvent({ name, date, seats = 0 }) {
  console.log(`Event: ${name}, Date: ${date}, Seats: ${seats}`);
}

const cloned = [...eventList];