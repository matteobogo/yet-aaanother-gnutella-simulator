package GUI.handlers;

//singleton fai impl

public class ParamsHandler {

  //params
  private long random_seed = 1234567890;
  private long simulation_cycles;
  private long network_size;
  private String protocol_link;
  private String protocol_coords;

  private long localCacheDimension;

  public ParamsHandler(
          long localCacheDimension) {

    this.localCacheDimension = localCacheDimension;
  }

}


//# Complex Network file:
//        #random.seed 1234567890
//        simulation.cycles 1
//        network.size 10000
//        protocol.link IdleProtocol
//        protocol.coord example.hot.InetCoordinates
//        init.0 example.hot.InetInitializer
//        init.0.protocol coord
//        init.1 example.hot.WireInetTopology
//        init.1.protocol link #the linkable to be wired
//        init.1.coord_protocol coord
//        init.1.alpha 4
//        control.io example.hot.InetObserver
//        control.io.protocol link
//        control.io.coord_protocol coord
//        control.io.file_base graph
//        control.degree DegreeStats
//        control.degree.protocol link
//        control.degree.undir