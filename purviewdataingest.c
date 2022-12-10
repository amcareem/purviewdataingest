// Import the necessary namespaces
using Microsoft.Purview.Ingestion.Api;
using Microsoft.Purview.Ingestion.Api.Models;

// Set up the API client
PurviewDataIngestionClient client = new PurviewDataIngestionClient("[client id]", "[client secret]");

// Ingest data
DataSet dataSet = client.IngestData(new FileData("[file path]"));
