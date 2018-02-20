package com.adm.utils.uft.model;

public class AUTEnvironmentFolder {
    public final static String ALM_PARAMETER_FOLDER_ID_FIELD = "id";
    public final static String ALM_PARAMETER_FOLDER_PARENT_ID_FIELD = "parent-id";
    public final static String ALM_PARAMETER_FOLDER_NAME_FIELD = "name";

    private String id;
    private String name;
    private String parentId;
    private String path;

    public AUTEnvironmentFolder(String id, String parentId, String name) {

        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParentId() {
        return parentId;
    }
}