//This program creates an instance of the API client, configures it with the necessary authentication credentials, and then uses the ingestData method to transfer data from a file into Purview. The DataSet object that is returned by the ingestData method is then used to print some information about the ingested data, such as the data source and the schema of the data.

// Import the necessary classes and packages
import com.microsoft.purview.ingestion.api.PurviewDataIngestionClient;
import com.microsoft.purview.ingestion.api.models.DataSet;
import com.microsoft.purview.ingestion.api.models.FileData;

public class IngestDataToPurview {
  public static void main(String[] args) {
    // Set up the API client
    PurviewDataIngestionClient client = new PurviewDataIngestionClient("[client id]", "[client secret]");

    // Ingest data
    DataSet dataSet = client.ingestData(new FileData("[file path]"));

    // Print information about the ingested data
    System.out.println("Data ingested successfully!");
    System.out.println("Data source: " + dataSet.getDataSource());
    System.out.println("Data schema: " + dataSet.getDataSchema());
  }
}
