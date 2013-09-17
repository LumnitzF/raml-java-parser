package org.raml.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.raml.model.parameter.Header;
import org.raml.model.parameter.QueryParameter;
import org.raml.parser.annotation.Key;
import org.raml.parser.annotation.Mapping;
import org.raml.parser.annotation.Parent;
import org.raml.parser.annotation.Scalar;
import org.raml.parser.annotation.Sequence;

public class Action
{

    @Key
    private ActionType type;

    @Scalar
    private String summary;

    @Scalar
    private String description;

    @Mapping
    private Map<String, Header> headers = new HashMap<String, Header>();

    @Mapping
    private Map<String, QueryParameter> queryParameters = new HashMap<String, QueryParameter>();

    @Mapping
    private Map<String, MimeType> body = new HashMap<String, MimeType>();

    @Mapping
    private Map<String, Response> responses = new HashMap<String, Response>();

    @Parent
    private Resource resource;

    @Sequence
    private List<TemplateReference> is = new ArrayList<TemplateReference>();

    public Action()
    {
    }

    public ActionType getType()
    {
        return type;
    }

    public void setType(ActionType type)
    {
        this.type = type;
    }

    public String getSummary()
    {
        return summary;
    }

    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Map<String, Header> getHeaders()
    {
        return headers;
    }

    public void setHeaders(Map<String, Header> headers)
    {
        this.headers = headers;
    }

    public Map<String, QueryParameter> getQueryParameters()
    {
        return queryParameters;
    }

    public void setQueryParameters(Map<String, QueryParameter> queryParameters)
    {
        this.queryParameters = queryParameters;
    }

    public Map<String, MimeType> getBody()
    {
        return body;
    }

    public void setBody(Map<String, MimeType> body)
    {
        this.body = body;
    }

    public Map<String, Response> getResponses()
    {
        return responses;
    }

    public void setResponses(Map<String, Response> responses)
    {
        this.responses = responses;
    }

    public Resource getResource()
    {
        return resource;
    }

    public void setResource(Resource resource)
    {
        this.resource = resource;
    }

    public List<TemplateReference> getIs()
    {
        return is;
    }

    public void setIs(List<TemplateReference> is)
    {
        this.is = is;
    }

    @Override
    public String toString()
    {
        return "Action{" +
               "type='" + type + '\'' +
               ", resource=" + resource != null ? resource.getUri() : "-" +
               '}';
    }
}
