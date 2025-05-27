function addEvent(name, category) {
  events.push({ name, category });
}

function filterEventsByCategory(category) {
  return events.filter(e => e.category === category);
}

function registerUser(eventName) {
  const event = events.find(e => e.name === eventName);
  if (event) register(event);
}

function categoryTracker(category) {
  let total = 0;
  return function () {
    total++;
    console.log(`${total} registered for ${category}`);
  };
}