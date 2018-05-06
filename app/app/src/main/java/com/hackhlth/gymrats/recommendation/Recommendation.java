package com.hackhlth.gymrats.recommendation;

public class Recommendation {
    private RecommendationLevel recommendationLevel;
    private String traitName;
    private String gene;
    private String variant;
    private String allele1;
    private String allele2;
    private String insight;
    private String recommendation;
    private String impact;
    private double frequency;

    public RecommendationLevel getRecommendationLevel() {
        return recommendationLevel;
    }

    public void setRecommendationLevel(RecommendationLevel recommendationLevel) {
        this.recommendationLevel = recommendationLevel;
    }

    public String getTraitName() {
        return traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getAllele1() {
        return allele1;
    }

    public void setAllele1(String allele1) {
        this.allele1 = allele1;
    }

    public String getAllele2() {
        return allele2;
    }

    public void setAllele2(String allele2) {
        this.allele2 = allele2;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
