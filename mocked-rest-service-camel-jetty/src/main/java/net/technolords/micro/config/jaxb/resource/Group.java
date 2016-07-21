package net.technolords.micro.config.jaxb.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Technolords on 2016-Jul-21.
 */
public class Group {
    private List<Complex> resources;

    public Group() {
        this.resources = new ArrayList<>();
    }

    @XmlElement(name = "resource")
    public List<Complex> getResources() {
        return resources;
    }

    public void setResources(List<Complex> resources) {
        this.resources = resources;
    }
}
