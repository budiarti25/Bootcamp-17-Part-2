/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RegionDAO;
import entities.Region;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Ignatius
 */
public class RegionController {

    private final RegionDAO rdao;
    
    public RegionController(Connection connection) {
        this.rdao = new RegionDAO(connection);
    }
    
    /**
     * Fungsi untuk melakukan insert data dengan parameter regionId dan regionName dengan return value boolean
     * @param regionId region_id yang ingin ditambahkan. String.
     * @param regionName region_name yang ingin ditambahkan. String
     * @return memanggil method insert dari class RegionDAO dengan parameter membuat instance dari kelas Region
     * dimana instance tersebut berisi regionId dan regionName
=======
    /**
     * fungsi save 
     * @param regionId String
     * @param regionName String
     * @return rdao.insert menambahkan data pada region
>>>>>>> 38f8593 Countrypart2
     */
    public boolean save(String regionId, String regionName){
        return this.rdao.insert(new Region(Integer.parseInt(regionId), regionName));
    }
    
    /**
<<<<<<< Upstream, based on origin/master
     * Fungsi untuk melakukan update data dengan parameter regionId dan regionName dengan return value boolean
     * @param regionId region_id yang ingin diubah. String.
     * @param regionName region_name yang ingin diubah. String
     * @return memanggil method update dari class RegionDAO dengan parameter membuat instance dari kelas Region
     * dimana instance tersebut berisi regionId dan regionName
=======
     * fungsi edit
     * @param regionId String
     * @param regionName String
     * @return rdao.update mengubah data pada region
>>>>>>> 38f8593 Countrypart2
     */
    public boolean edit(String regionId, String regionName){
        return this.rdao.update(new Region(Integer.parseInt(regionId), regionName));
    }
    
    /**
<<<<<<< Upstream, based on origin/master
     * Fungsi untuk menghapus data dari Regions
     * @param regionId id data yang ingin di hapus. String.
     * @return memanggil Fungsi delete dari class RegionDAO dengan parameter regionId
=======
     * fungsi drop
     * @param regionId
     * @return rdao.delete menghapus data pada region
>>>>>>> 38f8593 Countrypart2
     */
    public boolean drop(String regionId){
        return this.rdao.delete(Integer.parseInt(regionId));
    }
    
    /**
<<<<<<< Upstream, based on origin/master
     * Fungsi untuk menampilkan semua data
     * @return memanggil fungsi getAll dari class RegionDAO
=======
     * fungsi list<object> binding
     * @return rdao.getAll memanggil semua data dan disimpan pada list<object>
>>>>>>> 38f8593 Countrypart2
     */
    public List<Object[]> binding(){
        return this.rdao.getAll();
    }
    
    /**
<<<<<<< Upstream, based on origin/master
     * Fungsi untuk menampilkan semua data dengan terurut
     * @param category order by category. String.
     * @param sort tipe sortir
     * @return memanggil fungsi getAll dari class RegionDAO dengan parameter catogory dan sort
=======
     * fungsi List<Object[]> bindingSort
     * @param category String
     * @param sort String
     * @return rdao.getAllSort memanggil semua data dan disimpan pada list<object> berdasarkan parameter tertentu
>>>>>>> 38f8593 Countrypart2
     */
    public List<Object[]> bindingSort(String category, String sort){
        return this.rdao.getAllSort(category, sort);
    }
    
    /**
<<<<<<< Upstream, based on origin/master
     * Fungsi untuk menampilkan data tertentu
     * @param category pencarian data berdasarkan variabel ini. String.
     * @param data keyword pencarian. String.
     * @return memamnggil fungsi search dari class RegionDAO dengan parameter category dan data
=======
     * fungsi List<object> find
     * @param category
     * @param data
     * @return rdao.search melakukan pencarian data dan disimpan pada list<object> berdasarkan parameter tertentu
>>>>>>> 38f8593 Countrypart2
     */
    public List<Object[]> find(String category, String data){
        return this.rdao.search(category, data);
    }
    
    /**
<<<<<<< Upstream, based on origin/master
     * Fungsi untuk mrngambil data berdasarkan id
     * @param regionId id data yang ingin ditampilkan
     * @return memanggil fungsi getById dengan parameter regionId
=======
     * fungsi findById
     * @param regionId
     * @return rdao.getById melakukan pemanggilan data dan disimpan pada object berdasarkan parameter regionId
>>>>>>> 38f8593 Countrypart2
     */
    public Object findById(String regionId){
        return this.rdao.getById(Integer.parseInt(regionId));
    }
    
    /**
<<<<<<< Upstream, based on origin/master
     * Fungsi untuk generate otomatis id
     * @return memanggil method getAutoId dari class RegionDAO
=======
     * fungsi getAutoId
     * @return rdao.getAutoId menghasilkan auto increment untuk id
>>>>>>> 38f8593 Countrypart2
     */
    public String getAutoId(){
        return this.rdao.getAutoId();
    }
}
