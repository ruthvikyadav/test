class WoodDoor extends Door
{
    WoodDoor(Color color)
    {
        super(DoorType.WOOD, color);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("wood door");
    }
}