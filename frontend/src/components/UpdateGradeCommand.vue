<template>
    <v-card outlined>
        <v-card-title>
            UpdateGrade
        </v-card-title>

        <v-card-text>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <String label="Subject" v-model="value.subject" :editMode="editMode"/>
            <Number label="Grade" v-model="value.grade" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="updateGrade"
            >
                UpdateGrade
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UpdateGradeCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.name = '';
            this.value.subject = '';
            this.value.grade = 0;
        },
        watch: {
        },
        methods: {
            updateGrade() {
                this.$emit('updateGrade', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

