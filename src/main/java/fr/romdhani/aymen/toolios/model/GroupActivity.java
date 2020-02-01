package fr.romdhani.aymen.toolios.model;

public enum GroupActivity {
    APPLICATION("application"), DIRECTION("direction"), RESEARCH("research"), SOFTWARE("software"), COMMERCIAL("commercial");
    private String name;

    GroupActivity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
