package creational.builder;

public class Address {

    private String name;
    private String surname;
    private String houseNumber;
    private String street;
    private long zipCode;
    private String city;
    private String country;

    public static class Builder {

        private String name;
        private String surname;
        private String houseNumber;
        private String street;
        private long zipCode;
        private String city;
        private String country;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Builder setHouseNumber(String houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setZipCode(long zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Address build() {

            Address address = new Address();
            address.name = this.name;
            address.surname = this.surname;
            address.houseNumber = this.houseNumber;
            address.street = this.street;
            address.zipCode = this.zipCode;
            address.city = this.city;
            address.country = this.country;

            return address;
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + "\n"
                + street + " " + houseNumber + "\n"
                + city + " " + zipCode + " " + country;
    }

    public static void main(String[] args) {
        Address address = new Address.Builder("John", "Dow")
                .setStreet("Main")
                .setHouseNumber("10a")
                .setZipCode(123456)
                .setCity("Springfield")
                .setCountry("New Taxes")
                .build();

        System.out.println(address);
    }
}
