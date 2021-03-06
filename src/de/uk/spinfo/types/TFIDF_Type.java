
/* First created by JCasGen Fri Aug 12 12:41:42 CEST 2016 */
package de.uk.spinfo.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.DocumentAnnotation_Type;

/** 
 * Updated by JCasGen Fri Aug 12 12:45:33 CEST 2016
 * @generated */
public class TFIDF_Type extends DocumentAnnotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TFIDF_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TFIDF_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TFIDF(addr, TFIDF_Type.this);
  			   TFIDF_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TFIDF(addr, TFIDF_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TFIDF.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.uk.spinfo.types.TFIDF");
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "de.uk.spinfo.types.TFIDF");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "de.uk.spinfo.types.TFIDF");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tfWeight;
  /** @generated */
  final int     casFeatCode_tfWeight;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getTfWeight(int addr) {
        if (featOkTst && casFeat_tfWeight == null)
      jcas.throwFeatMissing("tfWeight", "de.uk.spinfo.types.TFIDF");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_tfWeight);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTfWeight(int addr, double v) {
        if (featOkTst && casFeat_tfWeight == null)
      jcas.throwFeatMissing("tfWeight", "de.uk.spinfo.types.TFIDF");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_tfWeight, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tfidfWeight;
  /** @generated */
  final int     casFeatCode_tfidfWeight;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getTfidfWeight(int addr) {
        if (featOkTst && casFeat_tfidfWeight == null)
      jcas.throwFeatMissing("tfidfWeight", "de.uk.spinfo.types.TFIDF");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_tfidfWeight);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTfidfWeight(int addr, double v) {
        if (featOkTst && casFeat_tfidfWeight == null)
      jcas.throwFeatMissing("tfidfWeight", "de.uk.spinfo.types.TFIDF");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_tfidfWeight, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotation;
  /** @generated */
  final int     casFeatCode_annotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotation(int addr) {
        if (featOkTst && casFeat_annotation == null)
      jcas.throwFeatMissing("annotation", "de.uk.spinfo.types.TFIDF");
    return ll_cas.ll_getRefValue(addr, casFeatCode_annotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotation(int addr, int v) {
        if (featOkTst && casFeat_annotation == null)
      jcas.throwFeatMissing("annotation", "de.uk.spinfo.types.TFIDF");
    ll_cas.ll_setRefValue(addr, casFeatCode_annotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_componentId;
  /** @generated */
  final int     casFeatCode_componentId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComponentId(int addr) {
        if (featOkTst && casFeat_componentId == null)
      jcas.throwFeatMissing("componentId", "de.uk.spinfo.types.TFIDF");
    return ll_cas.ll_getStringValue(addr, casFeatCode_componentId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComponentId(int addr, String v) {
        if (featOkTst && casFeat_componentId == null)
      jcas.throwFeatMissing("componentId", "de.uk.spinfo.types.TFIDF");
    ll_cas.ll_setStringValue(addr, casFeatCode_componentId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TFIDF_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_tfWeight = jcas.getRequiredFeatureDE(casType, "tfWeight", "uima.cas.Double", featOkTst);
    casFeatCode_tfWeight  = (null == casFeat_tfWeight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tfWeight).getCode();

 
    casFeat_tfidfWeight = jcas.getRequiredFeatureDE(casType, "tfidfWeight", "uima.cas.Double", featOkTst);
    casFeatCode_tfidfWeight  = (null == casFeat_tfidfWeight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tfidfWeight).getCode();

 
    casFeat_annotation = jcas.getRequiredFeatureDE(casType, "annotation", "de.julielab.jcore.types.Annotation", featOkTst);
    casFeatCode_annotation  = (null == casFeat_annotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotation).getCode();

 
    casFeat_componentId = jcas.getRequiredFeatureDE(casType, "componentId", "uima.cas.String", featOkTst);
    casFeatCode_componentId  = (null == casFeat_componentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_componentId).getCode();

  }
}



    