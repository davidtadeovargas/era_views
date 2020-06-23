/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Serie;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.SerieCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class SeriesCombobox extends BaseComboBox<Serie> {
    
    private Type Type;
    
    
    public SeriesCombobox(){
        super(new SerieCellRender());
    }

    public void setType(Type Type) {
        this.Type = Type;
    }
        
    @Override
    List<Serie> getItems() throws Exception {
        
        //Emtpy model
        final Serie Serie = new Serie();
        Serie.setDescription("");
        
        final List<Serie> series = new ArrayList<>();
        series.add(Serie); //Add the empty model
        
        //Get the list of series depending the type
        List<Serie> seriesDB;
        switch(Type){
            
            case PREV:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSeriePREV();
                break;
            case NOTC:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieNOTC();
                break;
            case NOTP:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieNOTP();
                break;
            case FAC:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieFAC();
                break;
            case TIK:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieTIK();
                break;
            case COT:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieCOT();
                break;
            case EMP:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieEMP();
                break;
            case PROV:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSeriePROV();
                break;
            case REM:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieREM();
                break;                
            case COMP:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieCOMP();
                break;
            case ORDC:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieORDC();
                break;
            case CXC:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSerieCXC();
                break;
            case PED:
                seriesDB = (List<Serie>)RepositoryFactory.getInstance().getSeriesRepository().getAllSeriePED();
                break;
            default:
                seriesDB = new ArrayList<>();
                break;
        }
        
        //Add them all to the list
        series.addAll(seriesDB);
        
        return series;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Serie SerieItem = (Serie)ObjectItem;
        final Serie SerieMethod = (Serie)ObjectMethod;
        
        boolean  found = false;        
        if(SerieItem.getSer() != null && SerieItem.getSer().compareTo(SerieMethod.getSer())==0){
            found = true;
        }
        
        return found;
    }
    
    public enum Type {
        PREV,
        NOTC,
        NOTP,
        FAC,
        TIK,
        COT,
        EMP,
        PROV,
        REM,
        COMP,
        ORDC,
        CXC,
        PED
    }
}
