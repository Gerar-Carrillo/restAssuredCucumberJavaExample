package model;

public class Planet {
    private String orbital_period;

    private String surface_water;

    private String diameter;

    private String gravity;

    private String name;

    private String climate;

    private String rotation_period;

    private String terrain;

    private String population;

    public String getOrbital_period ()
    {
        return orbital_period;
    }

    public void setOrbital_period (String orbital_period)
    {
        this.orbital_period = orbital_period;
    }

    public String getSurface_water ()
    {
        return surface_water;
    }

    public void setSurface_water (String surface_water)
    {
        this.surface_water = surface_water;
    }

    public String getDiameter ()
    {
        return diameter;
    }

    public void setDiameter (String diameter)
    {
        this.diameter = diameter;
    }

    public String getGravity ()
    {
        return gravity;
    }

    public void setGravity (String gravity)
    {
        this.gravity = gravity;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getClimate ()
    {
        return climate;
    }

    public void setClimate (String climate)
    {
        this.climate = climate;
    }

    public String getRotation_period ()
    {
        return rotation_period;
    }

    public void setRotation_period (String rotation_period)
    {
        this.rotation_period = rotation_period;
    }

    public String getTerrain ()
    {
        return terrain;
    }

    public void setTerrain (String terrain)
    {
        this.terrain = terrain;
    }

    public String getPopulation ()
    {
        return population;
    }

    public void setPopulation (String population)
    {
        this.population = population;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [orbital_period = "+orbital_period+", surface_water = "+surface_water+", diameter = "+diameter+", gravity = "+gravity+", name = "+name+", climate = "+climate+", rotation_period = "+rotation_period+", terrain = "+terrain+", population = "+population+"]";
    }
}
