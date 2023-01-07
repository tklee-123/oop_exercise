package week13.builder.ex1;

public interface Builder {
    public Builder reset();
    public Builder setSeats(int number);
    public Builder setEngine(Engine engine);
    public Builder setTripComputer(TripComputer tripComputer);
    public Builder setGPS(GPS gps);
}
