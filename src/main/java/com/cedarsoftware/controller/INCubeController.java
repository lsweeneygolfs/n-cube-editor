package com.cedarsoftware.controller;

import com.cedarsoftware.ncube.NCube;

/**
 * Handle NCube Editor requests.
 *  
 * @author John DeRegnaucourt
 */
public interface INCubeController extends IBaseController
{
    Object[] getCubeList(String filter, String app, String version, String status);
    String getHtml(String name, String app, String version, String status);
    Object loadCube(String name, String app, String version, String status);
    Object[] getAppNames();
    Object[] getAppVersions(String app, String status);
    Object createCube(String name, String app, String version);
    Object deleteCube(String name, String app, String version);
    Object getReferencesTo(String name, String app, String version, String status);
    Object getReferencesFrom(String name, String app, String version, String status);
    Object getRequiredScope(String name, String app, String version, String status);
    Object duplicateCube(String newName, String name, String newApp, String app, String newVersion, String version, String status);
    Object releaseCubes(String app, String version, String newSnapVer);
    Object changeVersionValue(String app, String currVersion, String newSnapVer);
}
