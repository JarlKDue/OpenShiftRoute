import org.apache.camel.builder.RouteBuilder;


public class CamelTestRoute extends RouteBuilder {

//<editor-fold desc="Full Route Description">
    //Define Finals Here

//<editor-fold desc="Direct Log Endpoints">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Route Start Points">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Routes By ID">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Specific Route Endpoints">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Routes Walkthrough">

   
      /*
      Route Walkthrough
      Purpose
      Tools
      Speficis
      Error Handling
     */
    //</editor-fold>

//</editor-fold>


    @Override
    public void configure() throws Exception {

        from("timer:foo?period=10s").log("message sent").to("mock:test");

    }


}