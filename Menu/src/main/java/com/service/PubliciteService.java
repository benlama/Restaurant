/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.List;
import com.model.Publicite;

/**
 *
 * @author DNS
 */
public interface PubliciteService {
    public void insertPublicite(Publicite u);
    public void updatePublicite(Publicite u);
    public void deletePublicite(int id);
    public Publicite selectPublicite(int id);
    public List allPublicite();
}