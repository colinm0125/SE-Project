class DataStoreIntegration {
    public void dataStoreIntegrationTest() throws Exception {
        DataToFromComputeAPI api = new DataToFromComputeAPI(); // Initialize the api variable
        OutputConfig out;
        InputConfig in = new InputConfig(argument1, argument2); // Initialize the in variable with the required arguments

        api.readData(null);
        api.writeData(in, null);
    }
}
