<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>ResetPassword</name>
   <tag></tag>
   <elementGuidId>de18184d-2501-4831-81b0-ce6c730f2594</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;password\&quot; : \&quot;password\&quot;,\n\t\&quot;newPassword\&quot; : \&quot;rebahan\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${bearer_token}</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>User-Agent</name>
      <type>Main</type>
      <value>katalon</value>
   </httpHeaderProperties>
   <katalonVersion>7.5.11</katalonVersion>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://agree-logtan-api-dev.vsan-apps.playcourt.id/api/v1/users/change-password</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOiIyNGQyODdjMS01NjU4LTRlZTctODUwMS03ZjFlZWM0MDAyNzIiLCJ1c2VybmFtZSI6InJlYmFoYW4xIiwibmFtZSI6Ik1haG11ZCBLJyBTIiwicGhvbmVOdW1iZXIiOiIwODUzNzI4ODQ5OTU1Iiwicm9sZXMiOiIxIiwiYXZhdGFyIjoiaHR0cDovL2FncmVlLW1pbmlvLWFncmVlLWxvZ3Rhbi1kZXYudnNhbi1hcHBzLnBsYXljb3VydC5pZC9hZ3JlZS91c2VyLzAxMTExNmQ5LTMzNmEtNDg3NS1hNGFlLTBiNDM2NDg3OWI5NS5wbmciLCJrZXkiOiJwYXJ0bmVyLWxvZ2luIiwiZXhwaXJlc0luIjo2MDQ4MDAsImNyZWF0ZWRBdCI6IjIwMjEtMTEtMjFUMDI6MjA6MzMuNjIzWiIsImlhdCI6MTYzODkzODc0MCwiZXhwIjoxNjM5NTQzNTQwLCJhdWQiOiI5N2IzMzE5My00M2ZmLTRlNTgtOTEyNC1iM2E5YjlmNzJjMzQiLCJpc3MiOiJ0ZWxrb21kZXYifQ.kwQ5Qong4irjg688t3sjGECDMpaW5wzPkey8Lk7TdaqCNH01CBdFLFJ90ts5t66K4hO6sxhHlFh9Tiqfe89KNc1u3-I9P0_7lJzCmya0XYBc9nfwu7V4vsdoyDEfdip-qA98Nh0bhZukq5sQt5gqEpzZByILYxgnzU6pFsfpH7LPJXIhsiDcnngLAgNxuUGYLxnueQFMTCYDn6nZhRoP0Mjhp-dy4AwAk3M2UCEfDPb38tbbELAZ_dOMSk2J8zgidTuyFMTfdyEvpOthX68mVY5x7A8ybJT0t6MWt1Ct0zCHQsUtVOoSL9bole54nQYUv_JcFVtbTpxBNA7kgjrDgrjAZNRPVCwOrdYjujbc5zelpv_q22oU5EeKQ2LPaP4rIqxo06hTzi9URM6IJ7RuACtdCuYZx63Huf9iYQguw8k8fFvhj7h1-c31i0932N6gRHhJOZQ4pYgmH_UWWlZI_15GR4liP2sMaJiRs9nr8IoBn4eBpNXYeFY_354uaeOS83su2Hw5RQeQnGXSsLd3EQe3MnKoV7gEQr22K4HZZnwESI028BvX13YZ8n46fWt3ysmiqVRQUAf8voDYd52AGLDfcC79WGCaWz27rsLBI6GBMOBEBaDmx1pJlE-Bw3vCebXe5eqMbuutly5HbSGlS26Cq1IOj_L8n0DgqF1zw9w'</defaultValue>
      <description></description>
      <id>b34bfaf1-3ab6-412c-b147-371a09b8148f</id>
      <masked>false</masked>
      <name>bearer_token</name>
   </variables>
   <variables>
      <defaultValue>'24d287c1-5658-4ee7-8501-7f1eec400272'</defaultValue>
      <description></description>
      <id>d312f69f-95a6-4350-aa18-dc4c6ccf0418</id>
      <masked>false</masked>
      <name>user_ID</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
