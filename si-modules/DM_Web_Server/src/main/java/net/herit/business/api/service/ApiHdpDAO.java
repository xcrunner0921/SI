package net.herit.business.api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.herit.business.api.service.*;
import net.herit.business.device.service.DeviceModelVO;
import net.herit.business.device.service.DeviceVO;
import net.herit.business.device.service.ExtMoProfileVO;
import net.herit.business.device.service.MoProfileVO;
import net.herit.business.lwm2m.resource.ResourceVO;
import net.herit.common.dataaccess.*;
import net.herit.common.exception.UserSysException;
import net.herit.common.model.*;

import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapException;

@Repository("ApiHdpDAO")
public class ApiHdpDAO extends HeritHdpAbstractDAO {
	/** 클래스 명칭 */
	private final String CLASS_NAME = getClass().getName();
	/** 메소드명칭 */
	private String METHOD_NAME = "";
	
	public List<Object> getList(String queryId, HashMap<String, Object> po) throws UserSysException {
		METHOD_NAME = "getList";
		List resultList = null;

		try {
			resultList = getSqlMapClientTemplate().queryForList(
					"DeviceDAO.deviceList", po);

		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME,
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return resultList;
	}
	
	public Object get(String queryId, HashMap<String, Object> po) throws UserSysException {
		METHOD_NAME = "get";

		HashMap<String, Object> result = null;
		try {
			result = (HashMap)getSqlMapClientTemplate().queryForObject(
					"DeviceDAO.deviceCount", po);

		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME,
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
				
		return result;
	}
	
	
	/*public HashMap<String, String> getResUriNameInfo(String resourceUri) throws UserSysException {
		METHOD_NAME = "getResUriNameInfo";
		
		HashMap<String, String> resultMap = null;
		try {
			HashMap<String, String> po = new HashMap<String, String>();
			po.put("resourceUri", resourceUri);
			
			resultMap = (HashMap<String, String>)getSqlMapClientTemplate().queryForObject(
					"deviceModel.moProfile.extDisplayName", po);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return null;
	}*/
	
/*	public List<ExtMoProfileVO> getResUriNameList(String resourceUri) throws UserSysException {
		METHOD_NAME = "getResUriNameList";
		List resultList = null;

		try {
			HashMap<String, String> po = new HashMap<String, String>();
			po.put("resourceUri", resourceUri);
			resultList = getSqlMapClientTemplate().queryForList(
					"deviceModel.moProfile.extDisplayName", po);

		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME,
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return resultList;
	}*/
	
	//수정(2016.02.03 onem2m연동 관련)
	public ExtMoProfileVO getResUriNameInfo(String moProfileId) throws UserSysException {
		METHOD_NAME = "getResUriNameInfo";
		
		ExtMoProfileVO resultVO = null;
		
		try {
			HashMap<String, String> po = new HashMap<String, String>();
			po.put("moProfileId", moProfileId);
			
			resultVO = (ExtMoProfileVO)getSqlMapClientTemplate().queryForObject(
					"deviceModel.moProfile.extDisplayName", po);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return resultVO;
	}
	
	//추가(2016.02.03 onem2m연동 관련)
	public DeviceModelVO getDeviceModelId(String modelName) throws UserSysException {
		METHOD_NAME = "getDeviceModelId";
		
		DeviceModelVO resultVO = null;
		
		try {
			HashMap<String, String> po = new HashMap<String, String>();
			po.put("modelName", modelName);
			
			resultVO = (DeviceModelVO)getSqlMapClientTemplate().queryForObject(
					"DeviceModelVO.deviceModel.getId", po);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return resultVO;
	}
	
	//추가(2016.02.03 onem2m연동 관련)
	public MoProfileVO getMoProfileId(String deviceModelId, String resourceUri) throws UserSysException {
		METHOD_NAME = "getMoProfileId";
		
		MoProfileVO resultVO = null;
		
		try {
			HashMap<String, String> po = new HashMap<String, String>();
			po.put("deviceModelId", deviceModelId);
			po.put("resourceUri", resourceUri);
			
			resultVO = (MoProfileVO)getSqlMapClientTemplate().queryForObject(
					"MoProfileVO.moProfile.getId", po);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return resultVO;
	}
	
	public ProcessResult update(String queryId, HashMap<String, Object> po) throws UserSysException {
		METHOD_NAME = "update";

		ProcessResult result = null;

				
		return result;
	}
	
	public ProcessResult insert(String queryId, HashMap<String, Object> po) throws UserSysException {
		METHOD_NAME = "insert";

		ProcessResult result = null;

				
		return result;
	}
	
	public ProcessResult delete(String queryId, HashMap<String, Object> po) throws UserSysException {
		METHOD_NAME = "delete";

		ProcessResult result = null;

				
		return result;
	}

	
	/*************************************************
	 *			lwm2m 
	 *************************************************/
	
	// profile 갯수 확인
	public List<MoProfileVO> getResourceUriByDeviceModelId(String dmId) throws UserSysException {
		METHOD_NAME = "getMoProfileCountByDeviceModelId";
		
		List<MoProfileVO> result = null;
		int deviceModelId = Integer.parseInt(dmId);
		
		try {
			HashMap<String, Integer> po = new HashMap<String, Integer>();
			po.put("deviceModelId", deviceModelId);
			
			result = (List<MoProfileVO>)getSqlMapClientTemplate().queryForList(
					"MoProfileVO.get.resourceUri.by.deviceModelId", po);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return result;
	}
	
	
	// device model 갯수 확인
	public int getDeviceModelCountByModelName(String modelName) throws UserSysException {
		METHOD_NAME = "getDeviceModelCountByModelName";
		
		int result = 0;
		
		try {
			HashMap<String, String> po = new HashMap<String, String>();
			po.put("modelName", modelName);
			
			result = (Integer)getSqlMapClientTemplate().queryForObject(
					"deviceModel.get.count.by.modelName", po);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return result;
	}
	
	// profile 갯수 확인
	public int getMoProfileCountByDeviceModelId(String dmId) throws UserSysException {
		METHOD_NAME = "getMoProfileCountByDeviceModelId";
		
		int result = 0;
		int deviceModelId = Integer.parseInt(dmId);
		
		try {
			HashMap<String, Integer> po = new HashMap<String, Integer>();
			po.put("deviceModelId", deviceModelId);
			
			result = (Integer)getSqlMapClientTemplate().queryForObject(
					"MoProfileVO.get.count.by.deviceModelId", po);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return result;
	}
	
	
	
	/*************************************************
	 *			temp
	 * @return 
	 *************************************************/
	
	
	
	// profile
	public int insertsProfile(List<ResourceVO> list) throws UserSysException {
		METHOD_NAME = "insertsProfile";
		int result = 0;
		try{
			for(int i=0; i<list.size(); i++){
				result += insertProfile(list.get(i));
			}
			System.out.println(result);
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return result;
	}
	
	public int insertProfile(ResourceVO vo) throws UserSysException {
		METHOD_NAME = "insertProfile";
		
		int result = 0;
		
		try {
			HashMap<String, String> po = new HashMap<String, String>();
			po.put("resource_uri", vo.getResource_uri());
			po.put("profile_ver", vo.getProfile_ver());
			po.put("data_type", vo.getData_type());
			po.put("unit", vo.getUnit());
			po.put("noti_type", new String().valueOf(vo.getNoti_type()));
			po.put("operation", vo.getOperation());
			po.put("device_model_id", new String().valueOf(vo.getDevice_model_id()));
			po.put("is_diagnostic", vo.getIs_diagnostic());
			po.put("is_mandatory", vo.getIs_mandatory());
			po.put("display_name", vo.getDisplay_name());
			po.put("is_multiple", vo.getIs_multiple());
			po.put("is_historical", vo.getIs_historical());
			po.put("is_error", vo.getIs_error());
			po.put("default_value", vo.getDefault_value());
			po.put("description", vo.getDescription());
			po.put("is_display", vo.getIs_display());
			po.put("display_type", vo.getDisplay_type());
			
		
			result = (Integer) insert("MoProfile.insert", vo);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return result;
	}
	
	// 상태 이력 남기기 위한  resoure uri 불러오기
	// profile 갯수 확인
	public List<MoProfileVO> getStatusUris(HashMap<String, String> map) throws UserSysException {
		METHOD_NAME = "getMoProfileCountByDeviceModelId";
		
		List<MoProfileVO> result = null;
		
		try {
			result = (List<MoProfileVO>)getSqlMapClientTemplate().queryForList(
					"get.status.uris", map);
			
		} catch (SqlMapException ex) {
			throw new UserSysException(CLASS_NAME, METHOD_NAME, 
					"사용자관리 데이터 취득 처리에서 에러가 발생했습니다.", ex);
		}
		return result;
	}
}
