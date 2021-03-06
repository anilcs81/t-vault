// =========================================================================
// Copyright 2018 T-Mobile, US
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// See the readme.txt file for additional language around disclaimer of warranties.
// =========================================================================

package com.tmobile.cso.vault.api.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class AppRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4510268414369277124L;
	
	private String role_name;
	private String[] policies;
	private boolean bind_secret_id;
	private String secret_id_num_uses;
	private String secret_id_ttl;
	private Integer token_num_uses;

	public AppRole() {
	}

	public AppRole(String role_name, String[] policies, boolean bind_secret_id, String secret_id_num_uses,
			String secret_id_ttl, Integer token_num_uses) {
		super();
		this.role_name = role_name;
		this.policies = policies;
		this.bind_secret_id = bind_secret_id;
		this.secret_id_num_uses = secret_id_num_uses;
		this.secret_id_ttl = secret_id_ttl;
		this.token_num_uses = token_num_uses;
	}

	/**
	 * @return the role_name
	 */
	@ApiModelProperty(example="my-vault-approle", position=1)
	public String getRole_name() {
		return role_name;
	}

	/**
	 * @param role_name the role_name to set
	 */
	@ApiModelProperty(example="ccp-approle", position=2, required=true)
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	/**
	 * @return the policies
	 */
	@ApiModelProperty(position=3)
	public String[] getPolicies() {
		return policies;
	}

	/**
	 * @param policies the policies to set
	 */
	public void setPolicies(String[] policies) {
		this.policies = policies;
	}

	/**
	 * @return the bind_secret_id
	 */
	@ApiModelProperty(example="true", position=4)
	public boolean isBind_secret_id() {
		return bind_secret_id;
	}

	/**
	 * @param bind_secret_id the bind_secret_id to set
	 */
	public void setBind_secret_id(boolean bind_secret_id) {
		this.bind_secret_id = bind_secret_id;
	}

	/**
	 * @return the secret_id_num_uses
	 */
	@ApiModelProperty(example="1", position=5)
	public String getSecret_id_num_uses() {
		return secret_id_num_uses;
	}

	/**
	 * @param secret_id_num_uses the secret_id_num_uses to set
	 */
	public void setSecret_id_num_uses(String secret_id_num_uses) {
		this.secret_id_num_uses = secret_id_num_uses;
	}

	/**
	 * @return the secret_id_ttl
	 */
	@ApiModelProperty(example="100m", position=6)
	public String getSecret_id_ttl() {
		return secret_id_ttl;
	}

	/**
	 * @param secret_id_ttl the secret_id_ttl to set
	 */
	public void setSecret_id_ttl(String secret_id_ttl) {
		this.secret_id_ttl = secret_id_ttl;
	}

	/**
	 * @return the token_num_uses
	 */
	@ApiModelProperty(example="1", position=7)
	public Integer getToken_num_uses() {
		return token_num_uses;
	}

	/**
	 * @param token_num_uses the token_num_uses to set
	 */
	public void setToken_num_uses(Integer token_num_uses) {
		this.token_num_uses = token_num_uses;
	}

	
}
