import HomeHeader from "@components/layout/HomeHeader.vue";
import MenuBar from "@components/layout/MenuBar.vue";
import AdminSetupView from "@views/member/AdminSetupView.vue";
import Footer from "@components/layout/Footer.vue";

export const MemberRouters = [
    {
        path: '/member/setup',
        name: 'AdminSetupView',
        components: {
            header: HomeHeader,
            menu: MenuBar,
            default: AdminSetupView,
            footer: Footer
        }
    }
]