package amr.Domain.Services;


import amr.Domain.Interfaces.IThingService;

public class ThingService implements IThingService {


    @Override
    public String AddThing(String name, String value) {
        return   name + value ;
    }
}
