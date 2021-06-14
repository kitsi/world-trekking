package com.team2.worldtrekking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/region")
    public String displayRegions(Model model){
        model.addAttribute("regionModel", regionRepo.findAll());
        return "regionView";
    }

    @GetMapping("region/{title}")
    public String displaySingleRegion(@PathVariable String title, Model model) {
        Region retrievedRegion = regionRepo.findRegionByTitle(title); //finds a single region and populates it to {title}
        model.addAttribute("region", retrievedRegion);
        return "regionsView";
    }
}