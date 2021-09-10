class Brown
{
    public static Door trimDoor(DoorType model)
    {
        Door door = null;
        switch (model)
        {
            case GLASS:
                door = new GlassDoor(Color.BROWN);
                break;
              
            case FLUSH:
                door = new FlushDoor(Color.BROWN);
                break;
                  
            case WOOD:
                door = new WoodDoor(Color.BROWN);
                break;
                  
                default:
                break;
              
        }
        return door;
    }
}
