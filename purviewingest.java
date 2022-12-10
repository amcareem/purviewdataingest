//RnD done by Ahamed Musthafa Careem
// Install the required libraries and dependencies. You will need to install the Purview Data Ingestion API client library for Java, as well as any other dependencies that the library requires.

// Import the necessary classes and packages. In your Java code, you will need to import the classes and packages that you will use to interact with the API, such as the API client class and the classes for the data objects that you will be using.

// Set up the API client. To use the API, you will need to create an instance of the API client class and configure it with your authentication credentials.

// Ingest the data. Once you have set up the API client, you can use it to ingest data into Purview by calling the appropriate API methods and providing the necessary data objects as parameters.



// Import the necessary classes and packages
import com.microsoft.purview.ingestion.api.PurviewDataIngestionClient;
import com.microsoft.purview.ingestion.api.models.DataSet;
import com.microsoft.purview.ingestion.api.models.FileData;

// Set up the API client
PurviewDataIngestionClient client = new PurviewDataIngestionClient("[client id]", "[client secret]");

// Ingest data
DataSet dataSet = client.ingestData(new FileData("[file path]"));
