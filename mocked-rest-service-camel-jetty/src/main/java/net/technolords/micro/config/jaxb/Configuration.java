package net.technolords.micro.config.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import net.technolords.micro.config.jaxb.resource.Group;
import net.technolords.micro.config.jaxb.resource.Simple;

/**
 * Created by Technolords on 2016-Jul-20.
 */
public class Configuration {
    private String type;
    private String url;
    private Simple getResource;
    private Group postResources;

    @XmlAttribute(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlElement(name = "resource")
    public Simple getGetResource() {
        return getResource;
    }

    public void setGetResource(Simple getResource) {
        this.getResource = getResource;
    }

    @XmlElement(name = "resource-group")
    public Group getPostResources() {
        return postResources;
    }

    public void setPostResources(Group postResources) {
        this.postResources = postResources;
    }
}
