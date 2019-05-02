<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
   <xsl:template match="jsonObject">
      <product>
         <xsl:copy-of select="*[not(self::category)]" />
         <xsl:copy-of select="category/id" />
         <xsl:copy-of select="category/productType" />
      </product>
   </xsl:template>
</xsl:stylesheet>