<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : football.xsl
    Created on : Ngày 06 tháng 12 năm 2012, 16:45
    Author     : Administrator
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>football.xsl</title>
            </head>
            <body>
                <h1>Football Result</h1>
                <h3><xsl:value-of select="//League/@TITLE"/> </h3>
                <Table border="1">
                    <tr>
                        <TH>Stadium</TH>
                        <TH>Kick Off</TH>
                        <TH>Home Club</TH>
                        <TH>Goals</TH>
                        <TH>Visited Club</TH>
                        <TH>Goals</TH>
                    </tr>
                    <xsl:for-each select="/League/Match">
                        <tr>
                        <td><xsl:value-of select="@Stadium"/></td>
                        <td><xsl:value-of select="@KickOff"/></td>
                        <td><xsl:value-of select="Club[1]/@Name"/></td>
                        <td><xsl:value-of select="Club[1]/@Goals"/></td>
                        <td><xsl:value-of select="Club[2]/@Name"/></td>
                        <td><xsl:value-of select="Club[2]/@Goals"/></td>
                        
                        </tr>
                    </xsl:for-each>
                </Table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
