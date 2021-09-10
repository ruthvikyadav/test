class GlassDoor extends Door
{
    GlassDoor(Color color)
    {
        super(DoorType.GLASS,color );
        construct();
    }
      
    @Override
    void construct()
    {
        System.out.println("Glass door");
    }
}