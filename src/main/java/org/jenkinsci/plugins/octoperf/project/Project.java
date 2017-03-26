package org.jenkinsci.plugins.octoperf.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import static com.google.common.base.Preconditions.checkNotNull;


/**
 * A project encloses virtual users, scenarios and test results.
 * 
 * @author jerome
 *
 */
@Value
@JsonIgnoreProperties(ignoreUnknown=true)
public class Project {
  String id;
  String workspaceId;
  String name;
  
  @JsonCreator
  Project(
      @JsonProperty("id") final String id,
      @JsonProperty("workspaceId") final String workspaceId,
      @JsonProperty("name") final String name) {
    super();
    this.id = checkNotNull(id);
    this.workspaceId = checkNotNull(workspaceId);
    this.name = checkNotNull(name);
  }
}
