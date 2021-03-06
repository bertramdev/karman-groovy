package com.bertramlabs.plugins.karman.network

/**
 * Created by davidestes on 3/1/16.
 */
public abstract class SecurityGroupRule implements SecurityGroupRuleInterface{
	protected SecurityGroupInterface securityGroup
	protected Integer minPort
	protected Integer maxPort
	protected String ipProtocol
	protected String policy = 'ingress'
	protected String targetGroupName
	protected String targetGroupId
	protected String description
	private String direction
	private List<String> ipRange = new ArrayList<String>() 

	public SecurityGroupRule(SecurityGroupInterface securityGroup) {
		this.securityGroup = securityGroup
	}

	@Override
	public SecurityGroupInterface getSecurityGroup() {
		return securityGroup
	}

	@Override
	public void addIpRange(String ipRange) {

	}

	@Override
	public void addIpRange(List<String> ipRange) {

	}

	@Override
	public void removeIpRange(String ipRange) {

	}

	@Override
	public void removeIpRange(List<String> ipRange) {

	}

	@Override
	public List<String> getIpRange() {
		ipRange
	}

	@Override
	public void setMinPort(Integer port) {
		this.minPort = port
	}

	@Override
	public Integer getMinPort() {
		return minPort
	}

	@Override
	public void setMaxPort(Integer port) {
		this.maxPort = port
	}

	@Override
	public Integer getMaxPort() {
		return maxPort
	}

	@Override
	public void setIpProtocol(String protocol) {
		this.ipProtocol = protocol?.toLowerCase()
	}

	@Override
	public String getIpProtocol() {
		return this.ipProtocol
	}

	@Override
	String getPolicy() {
		return this.policy
	}

	@Override
	void setPolicy(String policy) {
		this.policy = policy
	}

	@Override
	void setTargetGroupName(String groupName) {
		this.targetGroupName = groupName
	}
	@Override
	void setTargetGroupId(String groupId) {
		this.targetGroupId = groupId
	}
	@Override
	String getTargetGroupName() {
		return this.targetGroupName
	}
	@Override
	String getTargetGroupId() {
		return this.targetGroupId
	}

	@Override
	void setDirection(String targetDirection) {
		this.direction = targetDirection
	}

	@Override
	String getDirection() {
		return direction
	}


	@Override
	void setDescription(String targetDescription) {
		this.description = targetDescription
	}

	@Override
	String getDescription() {
		return description
	}

	@Override
	public void save() {

	}

	@Override
	public void delete() {

	}
}
