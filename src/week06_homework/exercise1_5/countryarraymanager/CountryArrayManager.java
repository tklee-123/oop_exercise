package week06_homework.exercise1_5.countryarraymanager;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int country_idx = 0; country_idx < this.length - 1; country_idx++) {
            int min_idx = country_idx;
            for (int j = country_idx + 1; j < this.length; j++) {
                if (newArray[j].getPopulation() < newArray[min_idx].getPopulation()) {
                    min_idx = j;
                }
            }
            Country temp = newArray[min_idx];
            newArray[min_idx] = newArray[country_idx];
            newArray[country_idx] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int country_idx = 0; country_idx < this.length - 1; country_idx++) {
            int max_idx = country_idx;
            for (int j = country_idx + 1; j < this.length; j++) {
                if (newArray[j].getPopulation() > newArray[max_idx].getPopulation()) {
                    max_idx = j;
                }
            }
            Country temp = newArray[max_idx];
            newArray[max_idx] = newArray[country_idx];
            newArray[country_idx] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        int n = newArray.length;
        boolean swapped;
        do {
            swapped = false;
            for (int country_idx = 1; country_idx < n; country_idx++) {
                if (newArray[country_idx - 1].getArea() > newArray[country_idx].getArea()) {
                    Country temp = newArray[country_idx - 1];
                    newArray[country_idx - 1] = newArray[country_idx];
                    newArray[country_idx] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        int n = newArray.length;
        boolean swapped;
        do {
            swapped = false;
            for (int country_idx = 1; country_idx < n; country_idx++) {
                if (newArray[country_idx - 1].getArea() < newArray[country_idx].getArea()) {
                    Country temp = newArray[country_idx - 1];
                    newArray[country_idx - 1] = newArray[country_idx];
                    newArray[country_idx] = temp;
                    swapped = true;
                }
            }
            n = n - 1;
        } while (swapped);
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        int n = newArray.length;
        for (int i = 1; i < n; ++i) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        int n = newArray.length;
        for (int i = 1; i < n; ++i) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = key;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        AfricaCountry[] africaCountries = new AfricaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[index] = (AfricaCountry) country;
                index++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        AsiaCountry[] asiaCountries = new AsiaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[index] = (AsiaCountry) country;
                index++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        EuropeCountry[] europeCountries = new EuropeCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[index] = (NorthAmericaCountry) country;
                index++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries[index] = (OceaniaCountry) country;
                index++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[index] = (SouthAmericaCountry) country;
                index++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] mostPopulous = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            mostPopulous[i] = sortByDecreasingPopulation()[i];
        }
        return mostPopulous;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] leastPopulous = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            leastPopulous[i] = sortByIncreasingPopulation()[i];
        }
        return leastPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] largestArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestArea[i] = sortByDecreasingArea()[i];
        }
        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] smallestArea = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            smallestArea[i] = sortByIncreasingArea()[i];
        }
        return smallestArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] highestGDP = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highestGDP[i] = sortByDecreasingGdp()[i];
        }
        return highestGDP;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] lowestGDP = new Country[countries.length];
        for (int i = 0; i < howMany; i++) {
            lowestGDP[i] = sortByIncreasingGdp()[i];
        }
        return lowestGDP;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
