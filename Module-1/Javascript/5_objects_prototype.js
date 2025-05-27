function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const concert = new Event("Live Concert", "2025-07-01", 100);
console.log(Object.entries(concert));