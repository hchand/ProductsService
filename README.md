# ProductsService
A sample products Service to demonstrate WS02 API Manager, Enterprise Integrator, XSLT Transformation, XSD Validation, Rest endpoints (spring boot based microservices)

The following files are added to this repository
1. OfferQuoteCAR - Contains CAR file to be deployed on WSO2 enterprise integrator
2. OfferQuoteESB - Contains OfferQuoteService.xml api that gets the request from API Manager and routes to offers and quotes endpoints based on the category type from the request.
                   and also two endpoints OfferEP.xml and QuoteEP.xml
3. Transformation - Contains XSLT transformation and XSD validation applied on the response from the endpoints
4. Swagger - Swggger file generated from WSO2 enterprise integrator and imported into API Manager
5. offer-quote-details - Two spring boot based services returning offer and quote details based on the resource id
6. APIManagerConfig(pointing to integrator) - Config from API Manger after configuring products service pointing to enterprise integrator api and importing the swagger from EI
7. ProductsService-soapui-project.xml.zip - SOAP UI project  for products service

Flow is
  SOAP UI Request -> Products Service on API Manager -> API on EI -> Offer and Quote Microservices
  SOAP UI Response <- XSD validation  <- XSLT Transformation <- Response
  
  Steps to run -
  1. Please run offer-quote-details
  2. Deploy CAR file  in EI and make sure the endpoints are correct
  3. Take the api name and endpoint url from EI (to be used in API manager) and generate swagger file (to be imported in API Manager)
  4. Create product service using Swagger file and point to EI (Production and Sandbox) in API Manager Publisher
  5. Go to API Manager store and create an application and subscribe to product service
  6. Generate keys to be used in SOAP UI tests
  7. Run Soap UI tests :-)
  
