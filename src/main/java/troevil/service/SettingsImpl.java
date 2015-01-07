package troevil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import troevil.dao.SettingsMapper;
import troevil.interfaces.SettingsI;
import troevil.model.Settings;

@Service("settingsService")
public class SettingsImpl implements SettingsI {

	private SettingsMapper settingsMapper;

	public SettingsMapper getSettingsMapper() {
		return settingsMapper;
	}

	@Autowired
	public void setSettingsMapper(SettingsMapper settingsMapper) {
		this.settingsMapper = settingsMapper;
	}

	@Override
	public Settings getsettingbyname(String name) {
		return settingsMapper.selectByname(name);
	}

}
