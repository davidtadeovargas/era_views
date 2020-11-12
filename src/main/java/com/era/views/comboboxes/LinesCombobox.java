/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.era.views.comboboxes;

import com.era.models.Line;
import com.era.repositories.RepositoryFactory;
import com.era.views.comboboxes.cellrenders.LinesCellRender;
import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author PC
 */
public class LinesCombobox extends BaseComboBox<Line> {
    
    public LinesCombobox(){
        super(new LinesCellRender());
    }

    @Override
    List<Line> getItems() throws Exception {
        
        //Emtpy model
        final Line Line = new Line();
        Line.setCode("");
        
        final List<Line> lines = new ArrayList<>();
        lines.add(Line); //Add the empty model
        
        //Get the list of series depending the type
        List<Line> lines_ = (List<Line>)RepositoryFactory.getInstance().getLinesRepository().getAll();
        
        //Add them all to the list
        lines.addAll(lines_);
        
        return lines;
    }
    
    @Override
    protected boolean foundModel(Object ObjectItem, Object ObjectMethod){
        
        //Cast the models
        final Line LineItem = (Line)ObjectItem;
        final Line LineMethod = (Line)ObjectMethod;
        
        boolean  found = false;        
        if(LineItem.getCode() != null && LineItem.getCode().compareTo(LineMethod.getCode())==0){
            found = true;
        }
        
        return found;
    }
}
