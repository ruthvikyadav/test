class FlushDoor extends Door
{
    FlushDoor(Color color)
    {
        super(DoorType.FLUSH, color);
        construct();
    }
    @Override
    protected void construct()
    {
        System.out.println("flush Door ");
    }
}
