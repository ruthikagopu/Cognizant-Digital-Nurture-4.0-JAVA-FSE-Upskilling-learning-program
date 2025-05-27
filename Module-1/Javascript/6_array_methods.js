const eventList = [];
eventList.push({ name: "Yoga", category: "Wellness" });
const musicEvents = eventList.filter(e => e.category === "Music");
const displayCards = eventList.map(e => `Event: ${e.name}`);