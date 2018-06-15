
# Update "managed-schema" file at solr server core and add following text into it. This will enable search on every field.

<fieldType name="text_like" class="solr.TextField" positionIncrementGap="100">
    <analyzer type="index">
      <tokenizer class="solr.KeywordTokenizerFactory"/>
      <filter class="solr.WordDelimiterFilterFactory" catenateNumbers="0" generateNumberParts="1"
       splitOnCaseChange="0" generateWordParts="1" preserveOriginal="1" catenateAll="0" catenateWords="0"/>
      <filter class="solr.EdgeNGramFilterFactory" maxGramSize="50" minGramSize="3"/>
      <filter class="solr.LowerCaseFilterFactory"/>
    </analyzer>
    <analyzer type="query">
      <tokenizer class="solr.KeywordTokenizerFactory"/>
      <filter class="solr.LowerCaseFilterFactory"/>
    </analyzer>
  </fieldType>
  
  
 # Code to create schema. This code has SolrField enum.
 
 @Test
    public void create_managedSchema(){
        SolrClient solrClient = new HttpSolrClient.Builder(solrHost).build();
        Arrays.asList(SolrFields.values()).forEach(solrFields -> {

            Map<String,Object> objectMap = new HashMap<>();
            objectMap.put("name",solrFields.name());
            objectMap.put("indexed",Boolean.TRUE);
            objectMap.put("stored",Boolean.TRUE);
            objectMap.put("multiValued",solrFields.isMultivalued());
            objectMap.put("type",solrFields.getType());
            SchemaRequest.AddField addField = new SchemaRequest.AddField(objectMap);
            try {
                System.out.println(addField.process(solrClient));
            } catch (SolrServerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
  }
    
# SolrField Enum

public enum SolrFields {
    fmno(false,"text_like"),
    name(false,"text_like"),
    practice(true,"text_like"),
    subpractice(true,"text_like");




    private boolean multivalued;
    private String type;

    SolrFields(boolean multivalued, String type) {
        this.multivalued = multivalued;
        this.type = type;
    }

    public boolean isMultivalued() {
        return multivalued;
    }

    public String getType() {
        return type;
    }
}
    
    
