class WHITE
{
    static Door trimDoor(DoorType model)
    {
        Door door = null;
        switch (model)
        {
            case GLASS:
                door = new GlassDoor(Color.WHITE);
                break;
              
            case FLUSH:
                door = new FlushDoor(Color.WHITE);
                break;
                  
            case WOOD:
                door = new WoodDoor(Color.WHITE);
                break;
                  
                default:
                break;
              
        }
        return door;
    }
}