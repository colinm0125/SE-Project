class DataStoreIntegration {
    public void dataStoreIntegrationTest() throws Exception {
        DataToFromComputeAPI api = new DataToFromComputeAPI(); // Initialize the api variable
        OutputConfig out;
        List<Integer> l = new List<>();
        InputConfig in = new InputConfig(); // Initialize the in variable with the required arguments

        api.readData(0);
        api.writeData(in);
    }
}
